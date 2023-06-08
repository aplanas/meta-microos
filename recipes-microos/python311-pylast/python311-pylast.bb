SUMMARY = "A python interface to Last.fm"
DESCRIPTION = "A Python interface to Last.fm and other API-compatible websites such as Libre.fm \
 \
Features: \
- Simple public interface. \
- Access to all the data exposed by the Last.fm webservices. \
- Scrobbling support. \
- Full object-oriented design. \
- Proxy support. \
- Internal caching support for some webservices calls (disabled by default). \
- No extra dependencies but python itself. \
- Support for other API-compatible networks like Libre.fm \
- Python3-friendly (Starting from 0.5)."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python311-pylast-4.5.0-3.3.noarch.rpm"
RPM_HASH = "80fc696927d47910c1983af4311e817259786c926d7bdba5f9e4f6092ef1962b957251aa51817614829251b9a4ed3b851be34bde7e7335cf8e8f1796273ab5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylast) python311-pylast python3dist(pylast)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
