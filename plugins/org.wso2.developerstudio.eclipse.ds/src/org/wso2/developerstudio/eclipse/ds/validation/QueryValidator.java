/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.wso2.developerstudio.eclipse.ds.ExcelQuery;
import org.wso2.developerstudio.eclipse.ds.GSpreadQuery;
import org.wso2.developerstudio.eclipse.ds.QueryExpression;
import org.wso2.developerstudio.eclipse.ds.QueryParameter;
import org.wso2.developerstudio.eclipse.ds.QueryPropertyList;
import org.wso2.developerstudio.eclipse.ds.ResultMapping;
import org.wso2.developerstudio.eclipse.ds.Sparql;
import org.wso2.developerstudio.eclipse.ds.Sql;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.ds.Query}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface QueryValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateExpression(EList<QueryExpression> value);
	boolean validateSql(EList<Sql> value);
	boolean validateSparql(EList<Sparql> value);
	boolean validateProperties(EList<QueryPropertyList> value);
	boolean validateResult(ResultMapping value);
	boolean validateExcel(EList<ExcelQuery> value);
	boolean validateGspread(EList<GSpreadQuery> value);
	boolean validateParam(EList<QueryParameter> value);
	boolean validateId(String value);
	boolean validateInputEventTrigger(String value);
	boolean validateOutputEventTrigger(String value);
	boolean validateReturnGeneratedKeys(boolean value);
	boolean validateUseConfig(String value);
	boolean validateKeyColumns(String value);
}
