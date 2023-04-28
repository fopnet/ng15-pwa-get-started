mkdir jcef-macosx64 													 
(cd jcef-macosx64; unzip -uo ../jcef_app.app/Contents/Java/gluegen-rt.jar) 						 
(cd jcef-macosx64; unzip -uo ../jcef_app.app/Contents/Java/gluegen-rt-natives-macosx-universal.jar)		 
(cd jcef-macosx64; unzip -uo ../jcef_app.app/Contents/Java/jcef.jar) 							 	
(cd jcef-macosx64; unzip -uo ../jcef_app.app/Contents/Java/jogl-all.jar)						 
(cd jcef-macosx64; unzip -uo ../jcef_app.app/Contents/Java/jogl-all-natives-macosx-universal.jar)  
			 
jar -cvf jcef-macosx64.jar -C jcef-macosx64 .


cd ../../../../
cp src/binary_distrib/macosx64/bin/jcef-macosx64.jar macosx64/jcef-macosx64.jar
cp -r src/binary_distrib/macosx64/bin/jcef-macosx64/natives macosx64/natives
mkdir -p macosx64/src/org && cp -r src/java/org macosx64/src/org