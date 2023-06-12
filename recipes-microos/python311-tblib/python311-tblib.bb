SUMMARY = "Traceback serialization library"
DESCRIPTION = "Traceback serialization library. \
 \
It allows you to: \
 \
* Pickle  tracebacks and raise exceptions with pickled tracebacks in \
  different processes. This allows better error handling when running \
  code over multiple processes (imagine multiprocessing, billiard, \
  futures, celery etc). \
* Create traceback objects from strings (the ``from_string`` method). \
  *No pickling is used*. \
* Serialize tracebacks to/from plain dicts (the ``from_dict`` and \
  ``to_dict`` methods). *No pickling is used*. \
* Raise the tracebacks created from the aforementioned sources. \
 \
Again, note that using the pickle support is completely optional. You \
are solely responsible for security problems should you decide to use \
the pickle support."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python311-tblib-1.7.0-1.11.noarch.rpm"
RPM_HASH = "0b70858d5980d1d084a28f4e948c983c92eccffc647c2900b180142d7d8b1acbe9bd494503ef3c514a442eb34ca02c2a98d223b4a85b34f5af3f0b4f08f9fc47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tblib) \
python311-tblib \
python3dist(tblib)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
