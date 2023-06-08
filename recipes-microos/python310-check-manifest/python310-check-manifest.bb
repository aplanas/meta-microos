SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python310-check-manifest-0.49-2.2.noarch.rpm"
RPM_HASH = "ae42ff9733eda49ee2edac9433fe0c0fc5ec43570782b3637651bf2baaf76fbfb57edcfb761c0a8c29a350b39c66d4575fa64416e4782030089b83daf57859dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-check-manifest python3.10dist(check-manifest) python310-check-manifest python3dist(check-manifest)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-build python310-setuptools python310-toml update-alternatives"

inherit rpm
