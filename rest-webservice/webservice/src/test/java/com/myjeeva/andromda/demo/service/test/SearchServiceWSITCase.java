// license-header java merge-point
/* Autogenerated on 09/30/2012 15:47:17+0530 by AndroMDA
 *
 * TEMPLATE:    cxf/CXFTestClient.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SearchService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
*/
package com.myjeeva.andromda.demo.service.test;

import com.myjeeva.andromda.demo.service.IndexDocument;
import com.myjeeva.andromda.demo.service.IndexDocumentImpl;
import com.myjeeva.andromda.demo.service.PerformSearch;
import com.myjeeva.andromda.demo.service.PerformSearchImpl;
import com.myjeeva.andromda.demo.service.SearchServiceSEI;
import com.myjeeva.andromda.demo.vo.Document;
import com.myjeeva.andromda.demo.vo.SearchResult;
import junit.framework.AssertionFailedError;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Remote component interface for the SearchService.
 * 
 */
public class SearchServiceWSITCase
    extends TestSuite
{
    private Object scenario = null;

    /**
     * Constructor with no parameters
     */
    public SearchServiceWSITCase()
    {
        super();
        this.setName("SearchServiceWSITCase");
    }

    /*
     * Constructor with service name
     * @param name Service name to be tested
    public SearchServiceWSITCase(String name)
    {
        super(name);
    }
     */

    /*
     * Constructor with service name and scenario - allows running one scenario data line from spreadsheet
     * @param name Service name to be tested
     * @param scenarioIn the first column of the spreadsheet
    public SearchServiceWSITCase(String name, Object scenarioIn)
    {
        super(name);
        this.setScenario(scenarioIn);
    }
     */

    /**
     * @return the scenario
     */
    public Object getScenario()
    {
        return this.scenario;
    }

    /**
     * @param scenarioIn the scenario to set
     */
    public void setScenario(Object scenarioIn)
    {
        this.scenario = scenarioIn;
    }

    /*
     * JUnit test suite, calls DataDrivenTestSuite with data from SearchService.xls
     * @return TestSuite with ServiceName driver
    public static TestSuite suite()
    {
        // Uncomment to create DataDrivenTests with Excel data inputs
        // TestDriverDefinition parameters: dataClass, filename, sheet name. Populates dataClass with spreadsheet contents.
        //TestDriverDefinition driverDef = new TestDriverDefinition(SearchServiceTestData.class, "SearchService.xls", "SearchService");
        //DataDrivenTestSuite suite = new DataDrivenTestSuite(SearchServiceWSITCase.class, driverDef);
        // TODO: post processing of data and suite elements through a delegate class/method
        // Use this for running JUnit 4 tests with JUnit 3 test runner.
        //junit.framework.JUnit4TestAdapter(SearchServiceWSITCase.class);
        TestSuite suite = new TestSuite();
        suite.addTest(new SearchServiceWSITCase("indexDocument"));
        suite.addTest(new SearchServiceWSITCase("performSearch"));
        return suite;
    }
     */

    /** Run JUnit tests from the java main command line
     * @param args ignored
     */
    public static void main(String args[])
    {
        JUnitCore.main("com.myjeeva.andromda.demo.service.test.SearchServiceWSITCase");
    }

    // ---------------- test methods  ----------------------

   /**
    * Invokes the indexDocument service method on SearchService.
    * 
    * Operation parameters:
    *     documents Document
    * Operation return:
    *     indexDocumentResponse Boolean
    */
    @Test
    public void indexDocument()
    {
        System.out.println("Starting test: indexDocument for " + this.getName());
        // TestCase.setUp and tearDown methods for each individual service method test
        IndexDocumentImpl.indexDocumentSetUp();
        // Customize CreateInput method if different default input data is required.
        IndexDocument indexDocumentInput = IndexDocumentImpl.indexDocumentCreateInput();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"cxf-client.xml"});

        SearchServiceSEI client = (SearchServiceSEI)context.getBean("SearchServiceClient");

        Boolean indexDocumentResponse = null;
        try
        {
            indexDocumentResponse = client.indexDocument(
                 indexDocumentInput.getDocuments()  // java.util.List<Document>
            );
            if (indexDocumentResponse==null)
            {
                System.out.println("indexDocumentResponse Result was valid and null");
            }
            else
            {
                System.out.println(" Result = " + indexDocumentResponse.toString());
            }
        }
        catch (Exception ex)
        {
            System.out.println("SearchService client.indexDocument" + " threw exception " + ex);
            throw new AssertionFailedError(ex.toString());
        }
        IndexDocumentImpl.indexDocumentTearDown();
        System.out.println("Finished test for SearchService.indexDocument(documents)");
    }

   /**
    * Invokes the performSearch service method on SearchService.
    * 
    * Operation parameters:
    *     queryTerm String
    * Operation return:
    *     performSearchResponse SearchResult
    */
    @Test
    public void performSearch()
    {
        System.out.println("Starting test: performSearch for " + this.getName());
        // TestCase.setUp and tearDown methods for each individual service method test
        PerformSearchImpl.performSearchSetUp();
        // Customize CreateInput method if different default input data is required.
        PerformSearch performSearchInput = PerformSearchImpl.performSearchCreateInput();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"cxf-client.xml"});

        SearchServiceSEI client = (SearchServiceSEI)context.getBean("SearchServiceClient");

        SearchResult performSearchResponse = null;
        try
        {
            performSearchResponse = client.performSearch(
                 performSearchInput.getQueryTerm()  // String
            );
            if (performSearchResponse==null)
            {
                System.out.println("performSearchResponse Result was valid and null");
            }
            else
            {
                System.out.println(" Result = " + performSearchResponse.toString());
            }
        }
        catch (Exception ex)
        {
            System.out.println("SearchService client.performSearch" + " threw exception " + ex);
            throw new AssertionFailedError(ex.toString());
        }
        PerformSearchImpl.performSearchTearDown();
        System.out.println("Finished test for SearchService.performSearch(queryTerm)");
    }

    /**
     * JUnit test data class, used by DataDrivenTestSuite in suite()
     */
    public static class SearchServiceTestData
    {
        // TODO: Add test data fields here (populated by SearchService.xls spreadsheet
        // TODO: Recursively list every primitive parameter in entire operation parameter hierarchy

        @SuppressWarnings("unused")
        private Document indexDocumentDocuments;
        /**
         * Data value for documents indexDocument on used by DataDrivenTestSuite in suite().
         * indexDocumentdocuments must be the column name of the parameter in the spreadsheet
         * @param value Document to be populated manually
         */
        public void setIndexDocumentDocuments(Document value)
        {
            this.indexDocumentDocuments = value;
        }

        @SuppressWarnings("unused")
        private String performSearchQueryTerm;
        /**
         * Data value for queryTerm performSearch on used by DataDrivenTestSuite in suite().
         * performSearchqueryTerm must be the column name of the parameter in the spreadsheet
         * @param value String to be populated manually
         */
        public void setPerformSearchQueryTerm(String value)
        {
            this.performSearchQueryTerm = value;
        }
    }
}