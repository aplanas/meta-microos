SUMMARY = "English-Russian dictionary of computer terms"
DESCRIPTION = "The open English-Russian dictionary of computer terms with more than 2000 articles in StarDict format. It is not an academic dictionary."
LICENSE = "GFDL-1.1"

PV = "1.36"

RPM_NAME = "stardict-dic-enru-engcom-1.36-20.16.noarch.rpm"
RPM_HASH = "b1ec362ac9509fbf0494f4e617bd29cb4621f28740910aa224486d4b22af233b26098149fcf03d1648808fd1e7f45a4b9e3c0311085fd6619a8282a2ae295d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(stardict:ru) stardict-dic-enru-engcom"
RDEPENDS:${PN} += ""

inherit rpm
