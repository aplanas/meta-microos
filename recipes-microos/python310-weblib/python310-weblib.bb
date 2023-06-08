SUMMARY = "Tools to solve typical tasks in Web scraping"
DESCRIPTION = "Weblib provides tools to solve typical tasks in Web scraping."
LICENSE = "MIT"

PV = "0.1.30"

RPM_NAME = "python310-weblib-0.1.30-2.6.noarch.rpm"
RPM_HASH = "f6cb89e803c67cab8b6a45db2e1e6479db1a783eea2aa2cd7bdbd95992d53ecdffa4e88e066fcdbca7c1cedfef9d3180f5fddb4bafc36084904cda36a6f52419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblib python3.10dist(weblib) python310-weblib python3dist(weblib)"
RDEPENDS:${PN} += "python(abi) python310-pytils python310-six python310-user_agent"

inherit rpm
