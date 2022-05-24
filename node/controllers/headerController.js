import express from "express";

const router = express.Router();

const headerController = router.get("/", (req, res) => {
  res.header("Foo", "Bar");
  res.json({ message: "Adding a custom header.." });
});

export default headerController;
