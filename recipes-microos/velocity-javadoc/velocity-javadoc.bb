SUMMARY = "Javadoc for velocity"
DESCRIPTION = "Velocity is a Java-based template engine. It permits anyone to use the \
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
applications to be developed according to a true MVC model."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "velocity-javadoc-1.7-11.6.noarch.rpm"
RPM_HASH = "34babadb261c8a0f946c3b04314ff2f23a319a3dc4c4369a06f96822b6af0b111d222a855de477e8bdfe00fd1cf1aebd249155829d99e98812ba7a672e66972c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velocity-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
