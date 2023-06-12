SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python310-colorlog-6.7.0-1.3.aarch64.rpm"
RPM_HASH = "887aa59d1a508bb3a1f478929730c16c50a3806a6c660eb0ee3f1fb161922f2d1a866a9d3f873a845710e6231cc5a40c348d89cf44c84a69c904a2215e632ff5"

RPROVIDES:${PN} += "python3-colorlog \
python3.10dist(colorlog) \
python310-colorlog \
python310-colorlog(aarch-64) \
python3dist(colorlog)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
