SUMMARY = "Captures the output of subprocesses in real-time"
DESCRIPTION = "This package provides a drop-in alternative to `subprocess.run` that \
captures the output while still printing it in real-time, just the way \
`tee` does. \
 \
Printing output in real-time while still capturing is valuable for \
any tool that executes long-running child processes. For those, you do want \
to provide instant feedback (progress) related to what is happening."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-subprocess-tee-0.4.1-3.1.noarch.rpm"
RPM_HASH = "8a2ce6519a4c452acd0f9f07cc9d1fd378f5e7d740cb02ee44ef2559af0ec42020bbb8eb5d0f8739157168082c3f9d998319db939aa2ef7bb09777e25d9c3b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocess-tee python3.10dist(subprocess-tee) python310-subprocess-tee python3dist(subprocess-tee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
