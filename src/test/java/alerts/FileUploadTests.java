package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadFilePage = homePage.clickFileUpload();
        uploadFilePage.uploadFile("C:\\devTestRepos\\tau_java_sel\\resources\\chromedriver.exe");
        assertEquals(uploadFilePage.getUploadedFiles(), "chromedriver.exe", "Incorrect files");
    }
}
