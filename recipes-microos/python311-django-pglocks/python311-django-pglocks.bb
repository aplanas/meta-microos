SUMMARY = "PostgreSQL Advisory Locks for Django"
DESCRIPTION = "django-pglocks provides a useful context manager to manage PostgreSQL advisory \
locks. It requires Django (tested with 1.5), PostgreSQL, and (probably) psycopg2. \
 \
Advisory locks are application-level locks that are acquired and released purely \
by the client of the database; PostgreSQL never acquires them on its own. They \
are very useful as a way of signalling to other sessions that a higher-level \
resource than a single row is in use, without having to lock an entire table or \
some other structure. \
 \
It's entirely up to the application to correctly acquire the right lock. \
 \
Advisory locks are either session locks or transaction locks. A session lock is \
held until the database session disconnects (or is reset); a transaction lock is \
held until the transaction terminates. \
 \
Currently, the context manager only creates session locks, as the behavior of a \
lock persisting after the context body has been exited is surprising, and \
there's no way of releasing a transaction-scope advisory lock except to exit \
the transaction."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-django-pglocks-1.0.4-1.13.noarch.rpm"
RPM_HASH = "8fe027ba06b4dd94540dbfee4437f15439634beb28c2273edbc051352ed128b375b49c56fb5255c04dbb8bd4b4ae97beedcb6ace33e7dce4a5f3228de829da2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-pglocks) \
python311-django-pglocks \
python3dist(django-pglocks)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-psycopg2"

inherit rpm
