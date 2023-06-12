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

RPM_NAME = "python39-aioeventlet-0.5.2-4.3.noarch.rpm"
RPM_HASH = "76604330645e1fb305455d920b25cd45383a726dd220be24a986c57e062b56fe6062143babebdb7d321d6b13bc3903d210e2896ae1e475c3bf749ea5bba7e1e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aioeventlet) \
python39-aioeventlet \
python3dist(aioeventlet)"
RDEPENDS:${PN} += "python(abi) \
python39-eventlet"

inherit rpm
