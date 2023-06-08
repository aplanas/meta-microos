SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-ansel-1.0.0-2.1.noarch.rpm"
RPM_HASH = "22b176c950ed57964f6c04b16b6f7d575281e94869b52999ffd6ed5e32b060bd8348a11eded882571eb53d6683c309df3392ed6a357f0be40dc8385db85d81ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansel python3.10dist(ansel) python310-ansel python3dist(ansel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
