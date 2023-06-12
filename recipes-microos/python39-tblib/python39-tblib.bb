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

RPM_NAME = "python39-tblib-1.7.0-1.11.noarch.rpm"
RPM_HASH = "96787f54fc929f709f65534f5b7be60508ad7587b62aa583f912bbd86737104c0ebaf0df8b5a9344a99887c37cdd3f3fdaa4a5a65f279a4d02aaa58f570faf48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tblib) \
python39-tblib \
python3dist(tblib)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
