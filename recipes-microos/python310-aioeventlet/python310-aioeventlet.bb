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

RPM_NAME = "python310-aioeventlet-0.5.2-4.3.noarch.rpm"
RPM_HASH = "523ee393fc4b3778ae2862676fd1f4b3a1471e6d4a58c9a81c6e7d05b438ba8fde77f4bfc04fe97375311e62180dcea89152785720230fa55f45c458cc1a73e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioeventlet \
python3.10dist(aioeventlet) \
python310-aioeventlet \
python3dist(aioeventlet)"
RDEPENDS:${PN} += "python(abi) \
python310-eventlet"

inherit rpm
