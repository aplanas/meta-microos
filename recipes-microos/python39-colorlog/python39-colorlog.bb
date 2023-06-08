SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python39-colorlog-6.7.0-1.3.aarch64.rpm"
RPM_HASH = "015b08f136b009377db39df43b8af48dd204ed67c4efd8e30da4bdf0912c84bf41b4f42b7c418c827e2b4931fa78961e03ffa074a85ea962fcad4a60f719a4bd"

RPROVIDES:${PN} += "python3.9dist(colorlog) python39-colorlog python39-colorlog(aarch-64) python3dist(colorlog)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
