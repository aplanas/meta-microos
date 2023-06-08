SUMMARY = "An other URL extractor/viewer"
DESCRIPTION = "The urlscan utility displays URLs found in an email message with \
the respective context. Selecting an URL uses the Python webbrowser \
module to determine which browser to open. It also supports \
quoted-printable and base64 encoding."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "urlscan-0.9.10-1.2.noarch.rpm"
RPM_HASH = "2ad76a39eed19c394d2ba6bd008fd17eea2ec6980d096ea14cf1569c1d9e3ddc74fd9b0cbc1cd36157f54aeebb2437d9c26bae7ffba90032a7d8ccc65727f2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(urlscan) python3dist(urlscan) urlscan"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3 python3-base python3-urwid"

inherit rpm
