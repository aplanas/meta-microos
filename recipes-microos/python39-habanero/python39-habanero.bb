SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python39-habanero-1.2.3-1.3.noarch.rpm"
RPM_HASH = "71168536eec18641cd14af8e401ef856db9c0b9eeb4e9a908a58e1f57c03887fd96c8686eb5eaac281b0751c30d2da2488b058458bfd456e8df144951b70334e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(habanero) python39-habanero python3dist(habanero)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-tqdm"

inherit rpm
