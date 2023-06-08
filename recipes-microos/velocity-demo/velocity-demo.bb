SUMMARY = "Demo for velocity"
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

RPM_NAME = "velocity-demo-1.7-11.6.noarch.rpm"
RPM_HASH = "0376dd03d9eaa03e137e9905f4dcb7c2992920cfc4ebe33408a0f399eb8cf3316acd5fa301aba505c954b3171c40d15f256fceda6c5a28e799b6220f5f7ab4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velocity-demo"
RDEPENDS:${PN} += "velocity"

inherit rpm
