SUMMARY = "Time expression parser"
DESCRIPTION = "A small Python library to parse various kinds of time expressions, \
inspired by a StackOverflow question. \
 \
The single function pytimeparse.timeparse.timeparse defined in the \
library (also available as pytimeparse.parse) parses time expressions \
like the following: \
 \
  * 32m \
  * 2h32m \
  * 3d2h32m \
  * 1w3d2h32m \
  * 1w 3d 2h 32m \
  * 1 w 3 d 2 h 32 m \
  * ... \
 \
It returns the time as a number of seconds (an integer value if \
possible, otherwise a floating-point number) \
 \
A number of seconds can be converted back into a string using the \
datetime module in the standard library."
LICENSE = "MIT"

PV = "1.1.8"

RPM_NAME = "python311-pytimeparse-1.1.8-3.12.noarch.rpm"
RPM_HASH = "d23b61817d4f557dcc1cd12dcba1473aeb8f916857380943183d2287da215d9543550bb2db6e7317c3ab2262c44faede66a61d7176b1d456b35228e86a762133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytimeparse) \
python311-pytimeparse \
python3dist(pytimeparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
