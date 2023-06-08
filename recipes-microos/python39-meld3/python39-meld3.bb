SUMMARY = "HTML/XML templating engine for Python"
DESCRIPTION = "Meld3 is an HTML/XML templating system for Python 2.3+ which keeps template \
markup and dynamic rendering logic separate from one another. See \
http://www.entrian.com/PyMeld for a treatise on the benefits of this pattern."
LICENSE = "SUSE-Repoze"

PV = "2.0.1"

RPM_NAME = "python39-meld3-2.0.1-1.18.noarch.rpm"
RPM_HASH = "583bc670702199d065249ebc6bbbb8a58084afa042f42e31258f887a28cef14e7fdc5ef64335932c2d9c4cb3af6b7b147ddfa48840a2078ffc648d0a135957f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(meld3) python39-meld3 python3dist(meld3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
