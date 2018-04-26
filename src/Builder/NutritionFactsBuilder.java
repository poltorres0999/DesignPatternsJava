public class NutritionFacts {
	//Requiered parameters
	private final int servingSize;
	private final int servings;
	//Optional Parameters
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;

	public NutritionFacts(NutritionFactsBuilder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate;
	}

	//Other methods shuld be implemented,
	// but just for showing the pattern is not necessary

	//We need a static class builder to create the instances of NutritonFacts

	public static class NutritionFactsBuilder {
		//Requiered parameters
		private final int servingSize;
		private final int servings;
		//Optional Parameters
		private int calories;
		private int fat;
		private int sodium;
		private int carbohydrate;

		public NutritionFactsBuilder (int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public NutritionFactsBuilder setCalories(int calories) {
			this.calories = calories;
			return this;
		}
		
		public NutritionFactsBuilder setFat(int fat) {
			this.fat = fat;
			return this;
		}
		
		public NutritionFactsBuilder setSodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public NutritionFactsBuilder setCarbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFacts build () {
			return new NutritionFacts(this)
		}
		
		
