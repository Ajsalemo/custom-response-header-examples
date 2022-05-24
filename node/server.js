import express from "express";
import homeController from "./controllers/homeController.js";
import headerController from "./controllers/headerController.js";

const app = express();
const port = process.env.PORT || 3000;

app.use(homeController);
app.use("/api/headers", headerController);

app.listen(port, () => console.log(`Server listening at port ${port}.`));
