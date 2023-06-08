SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-mbstrdecoder-1.1.1-1.3.noarch.rpm"
RPM_HASH = "a86e2461e8c01c4a384f077e27893f01f7c32287365f34eaefde6f9970510fd96a8aa4abe43c4b47aedf58cc4a5b2e0e61b17cd51fac03138fa7fb84fc1a88fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mbstrdecoder python3.10dist(mbstrdecoder) python310-mbstrdecoder python3dist(mbstrdecoder)"
RDEPENDS:${PN} += "python(abi) python310-Faker python310-chardet"

inherit rpm
