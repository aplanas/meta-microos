SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-jinja2-time-0.2.0-3.14.noarch.rpm"
RPM_HASH = "0e6f518ce3f2802f9a840e15d37c0ecb3c5670cfd97765d65ac57d029b4cdf434adb31488b88892df9032ba69fd4807ea36a8cd659a87a327ff64695d8c371b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jinja2-time) python311-jinja2-time python3dist(jinja2-time)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-arrow"

inherit rpm
