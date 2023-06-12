SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-retry_decorator-1.1.1-1.13.noarch.rpm"
RPM_HASH = "a8a8296d08fee86925c9976a345bdf28b1b5cf28837c64a530a7699c95f0780c95c83c1a966691afca9342eb56b67abde1bf39f6a4138135721f0a79b1b7a862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(retry-decorator) \
python311-retry_decorator \
python3dist(retry-decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
