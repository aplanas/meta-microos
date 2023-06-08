SUMMARY = "A Session and Caching library with WSGI Middleware"
DESCRIPTION = "Beaker is a web session and general caching library that includes WSGI \
middleware for use in web applications. \
 \
As a general caching library, Beaker can handle storing for various times \
any Python object that can be pickled with optional back-ends on a \
fine-grained basis. \
 \
Beaker was built largely on the code from MyghtyUtils, then refactored and \
extended with database support. \
 \
Beaker includes Cache and Session WSGI middleware to ease integration with \
WSGI capable frameworks, and is automatically used by Pylons. \
 \
Features include: \
 \
* Fast, robust performance \
* Multiple reader/single writer lock system to avoid duplicate simultaneous \
  cache creation \
* Cache back-ends include dbm, file, memory, memcached, and database (Using \
  SQLAlchemy for multiple-db vendor support) \
* Signed cookie's to prevent session hijacking/spoofing \
* Cookie-only sessions to remove the need for a db or file backend (ideal \
  for clustered systems) \
* Extensible Container object to support new back-ends \
* Cache's can be divided into namespaces (to represent templates, objects, \
  etc.) then keyed for different copies \
* Create functions for automatic call-backs to create new cache copies after \
  expiration \
* Fine-grained toggling of back-ends, keys, and expiration per Cache object"
LICENSE = "BSD-3-Clause"

PV = "1.12.1"

RPM_NAME = "python311-Beaker-1.12.1-1.4.noarch.rpm"
RPM_HASH = "ad51595079513b701d38b4c125dec3fae12a0c82a905af80823d650e714ddc017a70c91d41a03e37f2a39b51c78e97a076998cd2fb45480bab9fa47ce216118a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(beaker) python311-Beaker python3dist(beaker)"
RDEPENDS:${PN} += "python(abi) python311-dbm python311-pylibmc python311-setuptools"

inherit rpm
