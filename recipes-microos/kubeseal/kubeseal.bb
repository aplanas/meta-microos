SUMMARY = "CLI for encrypting secrets to SealedSecrets"
DESCRIPTION = "Problem: 'I can manage all my K8s config in git, except Secrets.' \
 \
Solution: Encrypt your Secret into a SealedSecret, which is safe to store - even to a public repository. The SealedSecret can be decrypted only by the controller running in the target cluster and nobody else (not even the original author) is able to obtain the original Secret from the SealedSecret."
LICENSE = "Apache-2.0"

PV = "0.20.5"

RPM_NAME = "kubeseal-0.20.5-1.1.aarch64.rpm"
RPM_HASH = "26ffc2c2713249ae73ad5ce1ec93683cdd13068b0c733a4c60a45028f9717906390bca3253b86375f601e9c43c908f63acec473d9cb45dbeb96ec2f5d8e59f46"

RPROVIDES:${PN} += "kubeseal kubeseal(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
