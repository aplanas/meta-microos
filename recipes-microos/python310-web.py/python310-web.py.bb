SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python310-web.py-0.62-3.8.noarch.rpm"
RPM_HASH = "35f36f3878644d3e73c5be02b8c5420c21fb56716afb036e1945c41194b899a596414281dd239ade23c49449f20024f0c8e63cb1d1c2fb72fb3ec50c9c055596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-web.py \
python3.10dist(web.py) \
python310-web.py \
python3dist(web.py)"
RDEPENDS:${PN} += "python(abi) \
python310-cheroot"

inherit rpm
