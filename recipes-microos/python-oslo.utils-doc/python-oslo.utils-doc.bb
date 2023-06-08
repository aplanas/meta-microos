SUMMARY = "Documentation for OpenStack utils library"
DESCRIPTION = "Documentation for OpenStack utils library."
LICENSE = "Apache-2.0"

PV = "6.1.0"

RPM_NAME = "python-oslo.utils-doc-6.1.0-1.3.noarch.rpm"
RPM_HASH = "8e84d7793533e3a72c55d51f20df93b280ec22a466f0d2f204d32ff95280f0dd0cdf9d117ba9723b2dab98739da4a5c87112de7e22c267feb54679d59abe58bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.utils-doc"
RDEPENDS:${PN} += ""

inherit rpm
