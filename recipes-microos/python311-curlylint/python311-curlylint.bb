SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python311-curlylint-0.13.1-1.4.noarch.rpm"
RPM_HASH = "bbebcc8f684a80644b095a6d19a7f01718a9dfdf129d4046d6f66f1b9e67550048fc15cb0177e5cf36f182afb06f5dfe9ef894a437051c882e7f1263bba1fa29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(curlylint) python311-curlylint python3dist(curlylint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-attrs python311-click python311-parsy python311-pathspec python311-toml"

inherit rpm
