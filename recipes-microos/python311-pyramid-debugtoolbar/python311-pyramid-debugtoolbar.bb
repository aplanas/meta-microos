SUMMARY = "An interactive HTML debugger for Pyramid application development"
DESCRIPTION = "A package which provides an interactive HTML debugger for Pyramid application \
development. \
 \
Note that pyramid-debugtoolbar is a blatant rip-off of Michael van Tellingen's \
flask-debugtoolbar (which itself was derived from Rob Hudson's \
django-debugtoolbar). It also includes a lightly sanded down version of the \
Werkzeug debugger code by Armin Ronacher and team."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "4.10"

RPM_NAME = "python311-pyramid-debugtoolbar-4.10-1.3.noarch.rpm"
RPM_HASH = "667433e70228953f1f55d0811f02074d09c0731a77c9c586aa1c474813f3e5c6328861f6c17aa409deeab6b7cc80717035eeff20dce6ccfbb4524795a9123729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyramid-debugtoolbar) python311-pyramid-debugtoolbar python3dist(pyramid-debugtoolbar)"
RDEPENDS:${PN} += "python(abi) python311-Pygments python311-pyramid python311-pyramid-mako"

inherit rpm
