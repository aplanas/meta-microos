SUMMARY = "Method and property caching decorators"
DESCRIPTION = "Cached descriptors cache their output.  They take into account \
instance attributes that they depend on, so when the instance \
attributes change, the descriptors will change the values they \
return. \
 \
Cached descriptors cache their data in _v_ attributes, so they are \
also useful for managing the computation of volatile attributes for \
persistent objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-zope.cachedescriptors-5.0-1.1.noarch.rpm"
RPM_HASH = "c6c670c840f7406ea6e82dd38b41bac75e09e152a870e84c3b1361f57685ed5040843fb93c9fc7d5e28ace2c24a532ceb21515ede8bf748e2c94388330cad5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.cachedescriptors) \
python311-zope.cachedescriptors \
python3dist(zope.cachedescriptors)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
