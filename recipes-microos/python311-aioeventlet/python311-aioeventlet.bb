SUMMARY = "Asyncio event loop scheduling callbacks in eventlet"
DESCRIPTION = "aioeventlet implements the asyncio API (PEP 3156) on top of eventlet. It makes \
possible to write asyncio code in a project currently written for eventlet. \
 \
aioeventlet allows to use greenthreads in asyncio coroutines, and to use \
asyncio coroutines, tasks and futures in greenthreads: see ``link_future()`` \
and ``wrap_greenthread()`` functions. \
 \
The main visible difference between aioeventlet and trollius is the behaviour \
of ``run_forever()``: ``run_forever()`` blocks with trollius, whereas it runs \
in a greenthread with aioeventlet. It means that aioeventlet event loop can run \
in an greenthread while the Python main thread runs other greenthreads in \
parallel."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python311-aioeventlet-0.5.2-4.3.noarch.rpm"
RPM_HASH = "489d152b003e34d8d561570ab1fb2d61b879a8d71960bc8bfdc0cda22ca21f7d8b87cb25b4cba6af182234033bc0ae082174379a104d7c72d9bee34e9c45b3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aioeventlet) python311-aioeventlet python3dist(aioeventlet)"
RDEPENDS:${PN} += "python(abi) python311-eventlet"

inherit rpm
