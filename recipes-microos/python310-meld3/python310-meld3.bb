SUMMARY = "HTML/XML templating engine for Python"
DESCRIPTION = "Meld3 is an HTML/XML templating system for Python 2.3+ which keeps template \
markup and dynamic rendering logic separate from one another. See \
http://www.entrian.com/PyMeld for a treatise on the benefits of this pattern."
LICENSE = "SUSE-Repoze"

PV = "2.0.1"

RPM_NAME = "python310-meld3-2.0.1-1.18.noarch.rpm"
RPM_HASH = "d3b5d031cbf802b220490e86a1787645c4a8b31acd993e24dead884512f71f2d4ef7d3ca663ef163a38bdfb40bef5a4892db51dfdb70fc3a0142a0aca84e0506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meld3 \
python3.10dist(meld3) \
python310-meld3 \
python3dist(meld3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
