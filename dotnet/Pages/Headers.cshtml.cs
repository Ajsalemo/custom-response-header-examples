using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace dotnet.Pages;

public class HeaderModel : PageModel
{
    private readonly ILogger<HeaderModel> _logger;

    public HeaderModel(ILogger<HeaderModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {
        Response.Headers.Add("Foo", "Bar");
    }
}
