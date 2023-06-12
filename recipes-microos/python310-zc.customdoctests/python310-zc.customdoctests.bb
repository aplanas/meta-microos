SUMMARY = "zc.customdoctests -- Use doctest with other languages"
DESCRIPTION = "doctest (and recently manuel) provide hooks for using custom doctest \
parsers.  `zc.customdoctests` helps to leverage this to support other \
languages, such as JavaScript:: \
 \
    js> function double (x) { \
    ...     return x*2; \
    ... } \
    js> double(2) \
    4 \
 \
And with `manuel <http://pypi.python.org/pypi/manuel>`_, it \
facilitates doctests that mix multiple languages, such as Python, \
JavaScript, and sh."
LICENSE = "ZPL-2.1"

PV = "1.0.1"

RPM_NAME = "python310-zc.customdoctests-1.0.1-2.8.noarch.rpm"
RPM_HASH = "805b4631fe6b73fa65b864ffe6e6f6924c7e0bf14eb223cc129ae7138f7e4d2811f9507a4647fce51e9c6a764e800b71ed0d548a340bf18d124f669a71ab9e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc.customdoctests \
python3.10dist(zc.customdoctests) \
python310-zc.customdoctests \
python3dist(zc.customdoctests)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
