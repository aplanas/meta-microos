SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-pure-eval-0.2.2-2.1.noarch.rpm"
RPM_HASH = "18122aa078fd9e2a81a0fa2959ae37bfef979b216359010be7edaec2896be047e96a437f11bb2ccd62d39edc37bf18a4a7270403720eb8a1bdfc1007cf8c2a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pure-eval) python39-pure-eval python3dist(pure-eval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
