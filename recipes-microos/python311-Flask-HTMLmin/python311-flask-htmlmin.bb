SUMMARY = "Flask minifier for HTML responses"
DESCRIPTION = "Flask-HTMLmin minimizes HTML rendered by Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-Flask-HTMLmin-2.2.0-1.3.noarch.rpm"
RPM_HASH = "019309431df6295fe5bfbde0aea58074f056f330b4d1a105eb201d952c81c46d54562dd76dc2736b640afdc1b0045caf753399edee5a141a44cf6ac93aaa8322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-htmlmin) python311-Flask-HTMLmin python3dist(flask-htmlmin)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-cssmin python311-htmlmin"

inherit rpm
