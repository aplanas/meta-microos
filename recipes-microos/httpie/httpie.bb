SUMMARY = "CLI, cURL-like tool for humans"
DESCRIPTION = "HTTPie consists of a single 'http' command designed for debugging and \
interaction with HTTP servers, RESTful APIs, and web services. \
 \
It allows for issuing arbitrary HTTP requests and displays colorized \
responses."
LICENSE = "BSD-3-Clause"

PV = "3.2.2"

RPM_NAME = "httpie-3.2.2-1.1.noarch.rpm"
RPM_HASH = "abdd6ca3bfc3aae43fb507efe9bbf95dacf45af07bc33fa489eefa113da23661347d5aa69c33d6d807f172df8e3702bf2ccdffa4e84d45d625870d2cebc81444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpie python3-httpie python3.10-httpie python3.10dist(httpie) python3dist(httpie)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PySocks python3-Pygments python3-charset-normalizer python3-defusedxml python3-multidict python3-pip python3-requests python3-requests-toolbelt python3-rich python3-setuptools update-alternatives"

inherit rpm
