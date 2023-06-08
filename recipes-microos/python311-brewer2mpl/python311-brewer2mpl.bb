SUMMARY = "colorbrewer2org color maps for Python and matplotlib"
DESCRIPTION = "brewer2mpl is a pure Python package for accessing colorbrewer2.org \
color maps from Python. With brewer2mpl, the raw RGB colors of all 165 \
colorbrewer2.org color maps can be retrieved. The color map data ships with \
brewer2mpl, so that no network connection is required. \
 \
For more information and to view some of the color maps, see the wiki at \
https://github.com/jiffyclub/brewer2mpl/wiki."
LICENSE = "Apache-2.0 & MIT"

PV = "1.4.1"

RPM_NAME = "python311-brewer2mpl-1.4.1-3.2.noarch.rpm"
RPM_HASH = "974f652a510c9bb35136a1d0adbca9eab572a56d605e91ecbceb6ab1fc40c1dfc1104eca77e4cc3ead101a55fe1e6ecfeb244ee4e16c58e3a92d48ec14028be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(brewer2mpl) python311-brewer2mpl python3dist(brewer2mpl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
