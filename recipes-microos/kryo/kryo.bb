SUMMARY = "Object graph serialization framework for Java"
DESCRIPTION = "Kryo is a fast and efficient object graph serialization framework for Java. \
The goals of the project are speed, efficiency, and an easy to use API. \
The project is useful any time objects need to be persisted, whether to a \
file, database, or over the network. \
 \
Kryo can also perform automatic deep and shallow copying/cloning. \
This is direct copying from object to object, not object->bytes->object."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-4.0.2-2.19.noarch.rpm"
RPM_HASH = "d8e253ee35e7f7d99c3a17c0f66760763e9f3fea0d48b0f6539c543c250cbf2a14537bc27bff2120d11bb741bdbc15603e85825093e4b00cc972369a8ab80d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo mvn(com.esotericsoftware.kryo:kryo) mvn(com.esotericsoftware.kryo:kryo:pom:) mvn(com.esotericsoftware:kryo) mvn(com.esotericsoftware:kryo:pom:) osgi(com.esotericsoftware.kryo)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.esotericsoftware:minlog) mvn(com.esotericsoftware:reflectasm) mvn(org.objenesis:objenesis)"

inherit rpm
