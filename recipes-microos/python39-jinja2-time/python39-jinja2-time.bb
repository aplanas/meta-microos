SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-jinja2-time-0.2.0-4.1.noarch.rpm"
RPM_HASH = "b9891d760cd27abf88c3b3ab4dac6bcabb153b16bd52f4a5c0a2949b1eda4f377324ac3b6d549405b1ff0dbd88ff4e34422ed0d590c44185d9ce2885de491f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jinja2-time) python39-jinja2-time python3dist(jinja2-time)"
RDEPENDS:${PN} += "python(abi) python39-Jinja2 python39-arrow"

inherit rpm
