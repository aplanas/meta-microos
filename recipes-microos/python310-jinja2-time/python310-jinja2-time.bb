SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-jinja2-time-0.2.0-3.14.noarch.rpm"
RPM_HASH = "94ad0fb00d682ccac7ac8cd86b4af749e118c17eb70589435ebf891f43722c24dca8142c394b8bc50190ab2c248210de67afa5acf3937748b17bb417eb511e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-time python3.10dist(jinja2-time) python310-jinja2-time python3dist(jinja2-time)"
RDEPENDS:${PN} += "python(abi) python310-Jinja2 python310-arrow"

inherit rpm
