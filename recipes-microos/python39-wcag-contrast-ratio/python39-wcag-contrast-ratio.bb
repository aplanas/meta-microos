SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python39-wcag-contrast-ratio-0.9-2.1.noarch.rpm"
RPM_HASH = "c713d3ce3b9e53e6c5018b0bf64a6d799c38ff9a4c68b34363a174224edb9aa043a62c529874cba494d92c92e16d17ecc15cdf582b313193b49b1c5fcc4f0f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wcag-contrast-ratio) python39-wcag-contrast-ratio python3dist(wcag-contrast-ratio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
