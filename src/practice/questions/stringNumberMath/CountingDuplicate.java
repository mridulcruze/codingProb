package practice.questions.stringNumberMath;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CountingDuplicate {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "skip to the end of the global utility bar\n" +
                "THE UNIVERSITY of NORTH CAROLINA at CHAPEL HILL\n" +
                "AccessibilityEventsLibrariesMapsDepartmentsConnectCarolinaUNC Search\n" +
                "Skip to main content\n" +
                "The Writing Center • University of North Carolina at Chapel Hill\n" +
                "APPOINTMENTS\n" +
                "SUBMIT A DRAFT\n" +
                "TIPS & TOOLS\n" +
                "BLOG\n" +
                "ENGLISH LANGUAGE \n" +
                "FACULTY AND GRADS \n" +
                "ABOUT \n" +
                "DONATE\n" +
                "SEARCH\n" +
                "Paragraphs\n" +
                "What this handout is about\n" +
                "This handout will help you understand how paragraphs are formed, how to develop stronger paragraphs, and how to completely and clearly express your ideas.\n" +
                "\n" +
                "What is a paragraph?\n" +
                "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph.\n" +
                "\n" +
                "How do I decide what to put in a paragraph?\n" +
                "Before you can begin to determine what the composition of a particular paragraph will be, you must first decide on an argument and a working thesis statement for your paper. What is the most important idea that you are trying to convey to your reader? The information in each paragraph must be related to that idea. In other words, your paragraphs should remind your reader that there is a recurrent relationship between your thesis and the information in each paragraph. A working thesis functions like a seed from which your paper, and your ideas, will grow. The whole process is an organic one—a natural progression from a seed to a full-blown paper where there are direct, familial relationships between all of the ideas in the paper.\n" +
                "\n" +
                "The decision about what to put into your paragraphs begins with the germination of a seed of ideas; this “germination process” is better known as brainstorming. There are many techniques for brainstorming; whichever one you choose, this stage of paragraph development cannot be skipped. Building paragraphs can be like building a skyscraper: there must be a well-planned foundation that supports what you are building. Any cracks, inconsistencies, or other corruptions of the foundation can cause your whole paper to crumble.\n" +
                "\n" +
                "So, let’s suppose that you have done some brainstorming to develop your thesis. What else should you keep in mind as you begin to create paragraphs? Every paragraph in a paper should be:\n" +
                "\n" +
                "Unified: All of the sentences in a single paragraph should be related to a single controlling idea (often expressed in the topic sentence of the paragraph).\n" +
                "Clearly related to the thesis: The sentences should all refer to the central idea, or thesis, of the paper (Rosen and Behrens 119).\n" +
                "Coherent: The sentences should be arranged in a logical manner and should follow a definite plan for development (Rosen and Behrens 119).\n" +
                "Well-developed: Every idea discussed in the paragraph should be adequately explained and supported through evidence and details that work together to explain the paragraph’s controlling idea (Rosen and Behrens 119).\n" +
                "How do I organize a paragraph?\n" +
                "There are many different ways to organize a paragraph. The organization you choose will depend on the controlling idea of the paragraph. Below are a few possibilities for organization, with links to brief examples:\n" +
                "\n" +
                "Narration: Tell a story. Go chronologically, from start to finish. (See an example.)\n" +
                "Description: Provide specific details about what something looks, smells, tastes, sounds, or feels like. Organize spatially, in order of appearance, or by topic. (See an example.)\n" +
                "Process: Explain how something works, step by step. Perhaps follow a sequence—first, second, third. (See an example.)\n" +
                "Classification: Separate into groups or explain the various parts of a topic. (See an example.)\n" +
                "Illustration: Give examples and explain how those examples support your point. (See an example in the 5-step process below.)\n" +
                "Illustration paragraph: a 5-step example\n" +
                "From the list above, let’s choose “illustration” as our rhetorical purpose. We’ll walk through a 5-step process for building a paragraph that illustrates a point in an argument. For each step there is an explanation and example. Our example paragraph will be about human misconceptions of piranhas.\n" +
                "\n" +
                "Step 1. Decide on a controlling idea and create a topic sentence\n" +
                "Paragraph development begins with the formulation of the controlling idea. This idea directs the paragraph’s development. Often, the controlling idea of a paragraph will appear in the form of a topic sentence. In some cases, you may need more than one sentence to express a paragraph’s controlling idea.\n" +
                "\n" +
                "Controlling idea and topic sentence — Despite the fact that piranhas are relatively harmless, many people continue to believe the pervasive myth that piranhas are dangerous to humans.\n" +
                "\n" +
                "Step 2. Elaborate on the controlling idea\n" +
                "Paragraph development continues with an elaboration on the controlling idea, perhaps with an explanation, implication, or statement about significance. Our example offers a possible explanation for the pervasiveness of the myth.\n" +
                "\n" +
                "Elaboration — This impression of piranhas is exacerbated by their mischaracterization in popular media.\n" +
                "\n" +
                "Step 3. Give an example (or multiple examples)\n" +
                "Paragraph development progresses with an example (or more) that illustrates the claims made in the previous sentences.\n" +
                "\n" +
                "Example — For example, the promotional poster for the 1978 horror film Piranha features an oversized piranha poised to bite the leg of an unsuspecting woman.\n" +
                "\n" +
                "Step 4. Explain the example(s)\n" +
                "The next movement in paragraph development is an explanation of each example and its relevance to the topic sentence. The explanation should demonstrate the value of the example as evidence to support the major claim, or focus, in your paragraph.\n" +
                "\n" +
                "Continue the pattern of giving examples and explaining them until all points/examples that the writer deems necessary have been made and explained. NONE of your examples should be left unexplained. You might be able to explain the relationship between the example and the topic sentence in the same sentence which introduced the example. More often, however, you will need to explain that relationship in a separate sentence.\n" +
                "\n" +
                "Explanation for example — Such a terrifying representation easily captures the imagination and promotes unnecessary fear.\n" +
                "\n" +
                "Notice that the example and explanation steps of this 5-step process (steps 3 and 4) can be repeated as needed. The idea is that you continue to use this pattern until you have completely developed the main idea of the paragraph.\n" +
                "\n" +
                "Step 5. Complete the paragraph’s idea or transition into the next paragraph\n" +
                "The final movement in paragraph development involves tying up the loose ends of the paragraph. At this point, you can remind your reader about the relevance of the information to the larger paper, or you can make a concluding point for this example. You might, however, simply transition to the next paragraph.\n" +
                "\n" +
                "Sentences for completing a paragraph — While the trope of the man-eating piranhas lends excitement to the adventure stories, it bears little resemblance to the real-life piranha. By paying more attention to fact than fiction, humans may finally be able to let go of this inaccurate belief.\n" +
                "\n" +
                "Finished paragraph\n" +
                "Despite the fact that piranhas are relatively harmless, many people continue to believe the pervasive myth that piranhas are dangerous to humans. This impression of piranhas is exacerbated by their mischaracterization in popular media. For example, the promotional poster for the 1978 horror film Piranha features an oversized piranha poised to bite the leg of an unsuspecting woman. Such a terrifying representation easily captures the imagination and promotes unnecessary fear. While the trope of the man-eating piranhas lends excitement to the adventure stories, it bears little resemblance to the real-life piranha. By paying more attention to fact than fiction, humans may finally be able to let go of this inaccurate belief.\n" +
                "\n" +
                "Troubleshooting paragraphs\n" +
                "Problem: the paragraph has no topic sentence\n" +
                "Imagine each paragraph as a sandwich. The real content of the sandwich—the meat or other filling—is in the middle. It includes all the evidence you need to make the point. But it gets kind of messy to eat a sandwich without any bread. Your readers don’t know what to do with all the evidence you’ve given them. So, the top slice of bread (the first sentence of the paragraph) explains the topic (or controlling idea) of the paragraph. And, the bottom slice (the last sentence of the paragraph) tells the reader how the paragraph relates to the broader argument. In the original and revised paragraphs below, notice how a topic sentence expressing the controlling idea tells the reader the point of all the evidence.\n" +
                "\n" +
                "Original paragraph\n" +
                "\n" +
                "Piranhas rarely feed on large animals; they eat smaller fish and aquatic plants. When confronted with humans, piranhas’ first instinct is to flee, not attack. Their fear of humans makes sense. Far more piranhas are eaten by people than people are eaten by piranhas. If the fish are well-fed, they won’t bite humans.\n" +
                "\n" +
                "Revised paragraph\n" +
                "\n" +
                "Although most people consider piranhas to be quite dangerous, they are, for the most part, entirely harmless. Piranhas rarely feed on large animals; they eat smaller fish and aquatic plants. When confronted with humans, piranhas’ first instinct is to flee, not attack. Their fear of humans makes sense. Far more piranhas are eaten by people than people are eaten by piranhas. If the fish are well-fed, they won’t bite humans.\n" +
                "\n" +
                "Once you have mastered the use of topic sentences, you may decide that the topic sentence for a particular paragraph really shouldn’t be the first sentence of the paragraph. This is fine—the topic sentence can actually go at the beginning, middle, or end of a paragraph; what’s important is that it is in there somewhere so that readers know what the main idea of the paragraph is and how it relates back to the thesis of your paper. Suppose that we wanted to start the piranha paragraph with a transition sentence—something that reminds the reader of what happened in the previous paragraph—rather than with the topic sentence. Let’s suppose that the previous paragraph was about all kinds of animals that people are afraid of, like sharks, snakes, and spiders. Our paragraph might look like this (the topic sentence is bold):\n" +
                "\n" +
                "Like sharks, snakes, and spiders, piranhas are widely feared. Although most people consider piranhas to be quite dangerous, they are, for the most part, entirely harmless. Piranhas rarely feed on large animals; they eat smaller fish and aquatic plants. When confronted with humans, piranhas’ first instinct is to flee, not attack. Their fear of humans makes sense. Far more piranhas are eaten by people than people are eaten by piranhas. If the fish are well-fed, they won’t bite humans.\n" +
                "\n" +
                "Problem: the paragraph has more than one controlling idea\n" +
                "If a paragraph has more than one main idea, consider eliminating sentences that relate to the second idea, or split the paragraph into two or more paragraphs, each with only one main idea. Watch our short video on reverse outlining to learn a quick way to test whether your paragraphs are unified. In the following paragraph, the final two sentences branch off into a different topic; so, the revised paragraph eliminates them and concludes with a sentence that reminds the reader of the paragraph’s main idea.\n" +
                "\n" +
                "Original paragraph\n" +
                "\n" +
                "Although most people consider piranhas to be quite dangerous, they are, for the most part, entirely harmless. Piranhas rarely feed on large animals; they eat smaller fish and aquatic plants. When confronted with humans, piranhas’ first instinct is to flee, not attack. Their fear of humans makes sense. Far more piranhas are eaten by people than people are eaten by piranhas. A number of South American groups eat piranhas. They fry or grill the fish and then serve them with coconut milk or tucupi, a sauce made from fermented manioc juices.\n" +
                "\n" +
                "Revised paragraph\n" +
                "\n" +
                "Although most people consider piranhas to be quite dangerous, they are, for the most part, entirely harmless. Piranhas rarely feed on large animals; they eat smaller fish and aquatic plants. When confronted with humans, piranhas’ first instinct is to flee, not attack. Their fear of humans makes sense. Far more piranhas are eaten by people than people are eaten by piranhas. If the fish are well-fed, they won’t bite humans.\n" +
                "\n" +
                "Problem: transitions are needed within the paragraph\n" +
                "You are probably familiar with the idea that transitions may be needed between paragraphs or sections in a paper (see our handout on transitions). Sometimes they are also helpful within the body of a single paragraph. Within a paragraph, transitions are often single words or short phrases that help to establish relationships between ideas and to create a logical progression of those ideas in a paragraph. This is especially likely to be true within paragraphs that discuss multiple examples. Let’s take a look at a version of our piranha paragraph that uses transitions to orient the reader:\n" +
                "\n" +
                "Although most people consider piranhas to be quite dangerous, they are, except in two main situations, entirely harmless. Piranhas rarely feed on large animals; they eat smaller fish and aquatic plants. When confronted with humans, piranhas’ instinct is to flee, not attack. But there are two situations in which a piranha bite is likely. The first is when a frightened piranha is lifted out of the water—for example, if it has been caught in a fishing net. The second is when the water level in pools where piranhas are living falls too low. A large number of fish may be trapped in a single pool, and if they are hungry, they may attack anything that enters the water.\n" +
                "\n" +
                "In this example, you can see how the phrases “the first” and “the second” help the reader follow the organization of the ideas in the paragraph.\n" +
                "\n" +
                "Works consulted\n" +
                "We consulted these works while writing this handout. This is not a comprehensive list of resources on the handout’s topic, and we encourage you to do your own research to find additional publications. Please do not use this list as a model for the format of your own reference list, as it may not match the citation style you are using. For guidance on formatting citations, please see the UNC Libraries citation tutorial. We revise these tips periodically and welcome feedback.\n" +
                "\n" +
                "Lunsford, Andrea. 2008. The St. Martin’s Handbook: Annotated Instructor’s Edition, 6th ed. New York: St. Martin’s.\n" +
                "\n" +
                "Rosen, Leonard J., and Laurence Behrens. 2003. The Allyn & Bacon Handbook, 5th ed. New York: Longman.\n" +
                "\n" +
                "Creative Commons License This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivs 4.0 License.\n" +
                "You may reproduce it for non-commercial use if you use the entire handout and attribute the source: The Writing Center, University of North Carolina at Chapel Hill\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "   \n" +
                "\n" +
                "UNC Center for Student Success\n" +
                "\n" +
                "\n" +
                "Find us on:\n" +
                "CarolinaGo for Android\n" +
                "CarolinaGo for iOS\n" +
                "\n" +
                "The Writing Center\n" +
                "Campus Box #5135\n" +
                "0127 SASB North\n" +
                "450 Ridge Road\n" +
                "Chapel Hill, NC 27599\n" +
                "(919) 962-7710\n" +
                "writing_center@unc.edu\n" +
                "\n" +
                "   \n" +
                "\n" +
                "SEARCH THIS SITE:\n" +
                "Search this site...\n" +
                "© 2023 The Writing Center • University of North Carolina at Chapel Hill";
        String[] strArr = str.split("[\\s|.]+");
        List<String> list = Arrays.asList(strArr);
        Map<String, Integer> mp = new HashMap<>();

        Arrays.stream(strArr).forEach(obj -> {
            if (mp.containsKey(obj)) {
                int cnt = mp.get(obj);
                mp.put(obj, ++cnt);
            } else {
                mp.put(obj, 1);
            }
        });
        System.out.println(mp.size()+" -> "+mp);
        System.out.println("Time:-"+(System.currentTimeMillis() - start));
    }
}
