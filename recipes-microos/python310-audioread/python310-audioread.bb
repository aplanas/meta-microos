SUMMARY = "Wrapper for audio decoding via selectable backends"
DESCRIPTION = "Decode audio files using whichever backend is available. The library \
currently supports: \
 \
- Gstreamer via PyGObject. \
- MAD via the pymad bindings. \
- FFmpeg or Libav via its command-line interface. \
- The standard library wave, aifc, and sunau modules (for \
  uncompressed audio formats)."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-audioread-3.0.0-1.4.noarch.rpm"
RPM_HASH = "4d7237da37a72ef2ef4dd1c406c722f35c3caecf081aaced0a8d70ca89c4989855b79e48e0b3ec2756a3ad674797a58ca605ce3ea238000c047a13437a115527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audioread python3.10dist(audioread) python310-audioread python3dist(audioread)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
