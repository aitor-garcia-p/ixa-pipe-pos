package es.ehu.si.ixa.ixa.pipe.pos.train;

import opennlp.tools.postag.POSEvaluator;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.TrainingParameters;

/**
 * Interface for pos tagger trainers.
 * @author ragerri
 * @version 2014-07-08
 */
public interface Trainer {

  /**
   * Train a pos model with a parameters file.
   * @param params
   *          the parameters file
   * @return the {@code POSModel} trained
   */
  POSModel train(TrainingParameters params);

  /**
   * Evaluate the trained model.
   * @param trainedModel
   *          the {@code POSModel} to evaluate
   * @param testSamples
   *          the test set
   * @return the accuracy of the model
   */
  POSEvaluator evaluate(POSModel trainedModel,
      ObjectStream<POSSample> testSamples);

}
