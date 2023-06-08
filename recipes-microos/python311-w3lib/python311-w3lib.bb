SUMMARY = "Library of Web-Related Functions"
DESCRIPTION = "This is a Python library of web-related functions, such as: \
 \
* remove comments, or tags from HTML snippets \
 \
* extract base url from HTML snippets \
 \
* translate entites on HTML strings \
 \
* encoding mulitpart/form-data \
 \
* convert raw HTTP headers to dicts and vice-versa \
 \
* construct HTTP auth header \
 \
* converting HTML pages to unicode \
 \
* RFC-compliant url joining \
 \
* sanitize urls (like browsers do) \
 \
* extract arguments from urls"
LICENSE = "BSD-3-Clause"

PV = "1.22.0"

RPM_NAME = "python311-w3lib-1.22.0-3.3.noarch.rpm"
RPM_HASH = "aa2a75a074e6a0e8504add819eace961049e932c6f950df07cdb62a7a2a6edd245c0795b7ee6d2df70ce4cf9f9f71f7b5ce6326660a12a85fbb6e75ff4372f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(w3lib) python311-w3lib python3dist(w3lib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
