# git clone https://github.com/cloudacademy/java11-junit5-archetype.git
# cd java11-junit5-archetype
# mvn clean install

mvn archetype:generate                          \
 -DarchetypeGroupId=com.cloudacademy.devops     \
 -DarchetypeArtifactId=java11-junit5-archetype  \
 -DarchetypeVersion=1.0.0-SNAPSHOT              \
 -DgroupId=br.mp.mprj                           \
 -DartifactId=pandomium                         \
 -Dversion=1.0.0-SNAPSHOT                       \
 -DinteractiveMode=false