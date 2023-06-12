SUMMARY = "Apache Velocity - JSR 223 Scripting"
DESCRIPTION = " \
Velocity is a Java-based template engine. It permits anyone to use the \
simple yet powerful template language to reference objects defined in \
Java code. \
When Velocity is used for web development, Web designers can work in \
parallel with Java programmers to develop web sites according to the \
Model-View-Controller (MVC) model, meaning that web page designers can \
focus solely on creating a site that looks good, and programmers can \
focus solely on writing top-notch code. Velocity separates Java code \
from the web pages, making the web site more maintainable over the long \
run and providing a viable alternative to Java Server Pages (JSPs) or \
PHP. \
Velocity's capabilities reach well beyond the realm of web sites; for \
example, it can generate SQL and PostScript and XML (see Anakia for more \
information on XML transformations) from templates. It can be used \
either as a standalone utility for generating source code and reports, \
or as an integrated component of other systems. Velocity also provides \
template services for the Turbine web application framework. \
Velocity+Turbine provides a template service that will allow web \
applications to be developed according to a true MVC model. \
 \
This package contains JSR 223 scripting support."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "velocity-engine-scripting-2.3-3.9.noarch.rpm"
RPM_HASH = "3d1c254c50318cd0a6e699e2db36355703703e8bb76cc25684f374ae09c13c223578748807dc81d36264741a7f86f8216a9d39ecaae9604759784641c2b50ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.velocity:velocity-engine-scripting) \
mvn(org.apache.velocity:velocity-engine-scripting:pom:) \
osgi(org.apache.velocity.engine-scripting) \
velocity-engine-scripting"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.velocity:velocity-engine-core)"

inherit rpm
