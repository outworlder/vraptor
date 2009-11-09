package br.com.caelum.vraptor.view;

/**
 * Allows header related results.
 * 
 * @author guilherme silveira
 * @since 3.0.3
 */
public interface Status {

	public void notFound();

	void header(String key, String value);
	
	void created();

	public void created(String location);
	public void ok();

}
