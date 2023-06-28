# BattlePlugin Api

### Usage

The BattlePlugin provides 2 events that you can listen to.
```BattleStartedEvent``` and ```BattleStoppedEvent```.

You can listen to them like any other Bukkit event.

### Installation

To get these events into your project on Maven.

1. Add the JitPack repository to your build file

```xml

<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

2. Add this dependency

```xml

<dependency>
  <groupId>com.github.JoKrus</groupId>
  <artifactId>dj-battle-plugin-api</artifactId>
  <version>v0.1.1</version>
</dependency>
```