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

RPM_NAME = "python310-w3lib-1.22.0-3.3.noarch.rpm"
RPM_HASH = "07d27aad792bb8f3803a34e7700c8a0f021a12259e9176cfd7c05e2a0915a8337fe175186b21b5fd39c0f680fb8d795b1096ec84e4d7293bdc7dfb1cad5630e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-w3lib \
python3.10dist(w3lib) \
python310-w3lib \
python3dist(w3lib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
